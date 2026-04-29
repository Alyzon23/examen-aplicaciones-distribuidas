# Skill: Curso Microservice Generator (Spring Boot)

## 🎯 Objetivo
Generar un microservicio completo llamado **curso** usando Spring Boot con arquitectura por capas.

---

## ⚙️ Contexto

| Item | Valor |
|------|-------|
| Java | 17 |
| Build | Maven |
| Lombok | habilitado |
| Base de datos | PostgreSQL |
| Paquete base | `com.unibe.Examen.Aplicaciones` |
| Entidad principal | Curso |

---

## 📂 Estructura requerida

```
src/main/java/com/unibe/Examen/Aplicaciones/curso/
├── entity/
│   └── Curso.java
├── repository/
│   └── CursoRepository.java
├── service/
│   ├── ICursoService.java
│   └── impl/
│       └── CursoServiceImpl.java
└── controller/
    └── CursoController.java
```

---

## 🛠️ Instrucciones

### 1. Entidad: Curso

- `id` — Long, autogenerado
- `nombre` — String
- `descripcion` — String
- `activo` — Boolean

Usar anotaciones JPA (`@Entity`, `@Table`, `@Id`, `@GeneratedValue`) y Lombok (`@Data`, `@AllArgsConstructor`, `@NoArgsConstructor`).

---

### 2. Repository

Extender `JpaRepository<Curso, Long>`.  
Agregar método de búsqueda por nombre (ignorando mayúsculas/minúsculas):

```java
List<Curso> findByNombreContainingIgnoreCase(String nombre);
```

---

### 3. Service Interface

Incluir los siguientes métodos con **paginación** en el listado:

```java
Page<Curso> getAll(Pageable pageable);
Curso getById(Long id);
List<Curso> getByNombre(String nombre);
Curso create(Curso curso);
Curso updateFull(Long id, Curso curso);
Curso updatePartial(Long id, Curso curso);
void delete(Long id);
```

---

### 4. Service Implementation

- Inyección de dependencias con `@RequiredArgsConstructor`
- `getById` lanza `RuntimeException` si no encuentra el recurso
- `updatePartial` solo actualiza campos no nulos

---

### 5. Controller

Mapear en `/api/cursos` con los siguientes endpoints:

| Método | URL | Descripción |
|--------|-----|-------------|
| GET | `/api/cursos?page=0&size=10` | Listar con paginación |
| GET | `/api/cursos/{id}` | Obtener por ID |
| GET | `/api/cursos/buscar?nombre=java` | Buscar por nombre |
| POST | `/api/cursos` | Crear curso (201 Created) |
| PUT | `/api/cursos/{id}` | Actualizar completo |
| PATCH | `/api/cursos/{id}` | Actualizar parcial |
| DELETE | `/api/cursos/{id}` | Eliminar (204 No Content) |

---

## 📝 Body de ejemplo

```json
{
  "nombre": "Programación Java",
  "descripcion": "Curso de Java desde cero",
  "activo": true
}
```

---

## 🧰 Herramienta utilizada

**Amazon Q Developer** (IDE Plugin) — el microservicio fue generado completamente a partir de este skill estructurado.
