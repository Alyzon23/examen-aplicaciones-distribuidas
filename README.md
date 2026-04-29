# Examen Práctico - Microservicios Spring Boot

## Descripción
Proyecto con dos microservicios desarrollados con Spring Boot, Java 17, PostgreSQL y Lombok.

- **Microservicio 1 - Curso** (generado con IA/Skill): CRUD completo con paginación y búsqueda por nombre.
- **Microservicio 2 - Profesor** (desarrollado manualmente): Arquitectura por capas con endpoints GET, GET by ID y POST.

---

## Requisitos
- Java 17
- Maven
- PostgreSQL corriendo en `localhost:5432`

## Configuración de Base de Datos
Crear la base de datos en PostgreSQL:
```sql
CREATE DATABASE examen;
```

Las tablas se crean automáticamente con `ddl-auto=update`.

---

## Instrucciones de Ejecución
```bash
mvn spring-boot:run
```
El servidor inicia en `http://localhost:8080`

---

## Endpoints - Microservicio 1: Curso

| Método | URL | Descripción |
|--------|-----|-------------|
| GET | `/api/cursos?page=0&size=10` | Listar con paginación |
| GET | `/api/cursos/{id}` | Obtener por ID |
| GET | `/api/cursos/buscar?nombre=java` | Buscar por nombre |
| POST | `/api/cursos` | Crear curso |
| PUT | `/api/cursos/{id}` | Actualizar completo |
| PATCH | `/api/cursos/{id}` | Actualizar parcial |
| DELETE | `/api/cursos/{id}` | Eliminar |

---

## Endpoints - Microservicio 2: Profesor

| Método | URL | Descripción |
|--------|-----|-------------|
| GET | `/api/profesores` | Listar todos |
| GET | `/api/profesores/{id}` | Obtener por ID |
| POST | `/api/profesores` | Crear profesor |


---

## Evidencia del Skill Utilizado (Microservicio 1)

**Herramienta:** Amazon Q Developer (IDE Plugin)

El skill completo utilizado para generar este microservicio se encuentra en [`skill.md`](./skill.md).

El microservicio fue generado completamente a partir de ese skill estructurado usando Amazon Q Developer.
