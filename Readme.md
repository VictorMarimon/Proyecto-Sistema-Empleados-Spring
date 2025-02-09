# Sistema de Gestión de Empleados - Backend

![Licencia](https://img.shields.io/badge/Licencia-MIT-blue.svg)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.7.3-green)
![Java](https://img.shields.io/badge/Java-17-orange)
![IntelliJ IDEA](https://img.shields.io/badge/IDE-IntelliJ%20IDEA-blue)
![MySQL](https://img.shields.io/badge/Database-MySQL-blue)

## Descripción

Este proyecto es el backend del **Sistema de Gestión de Empleados**, desarrollado con **Spring Boot** y **Java**. Proporciona una API REST para gestionar empleados dentro de una organización, permitiendo:

- Listar empleados
- Agregar nuevos empleados
- Editar información de empleados existentes
- Eliminar empleados

## Tecnologías Utilizadas

- [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) - Lenguaje de programación.
- [Spring Boot 2.7.3](https://spring.io/projects/spring-boot) - Framework para desarrollo de aplicaciones empresariales.
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa) - Abstracción para interacciones con la base de datos.
- [MySQL](https://www.mysql.com/) - Base de datos relacional.
- [Maven](https://maven.apache.org/) - Administrador de dependencias.

## Requisitos Previos

Antes de iniciar el proyecto, asegúrate de tener instalado lo siguiente:

- [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Maven](https://maven.apache.org/) (si no está incluido en tu IDE)
- [MySQL](https://www.mysql.com/) - Base de datos.
- [IntelliJ IDEA](https://www.jetbrains.com/idea/) o cualquier otro IDE compatible con Spring Boot.

## Instalación y Configuración

1. **Clonar el repositorio**:

   ```bash
   git clone https://github.com/VictorMarimon/Proyecto-Sistema-Empleados-Spring.git
   cd Proyecto-Sistema-Empleados-Spring
   ```

2. **Configurar la base de datos MySQL**:
   - Crear una base de datos en MySQL:
     ```sql
     CREATE DATABASE recursos_humanos_db;
     ```
   - Configurar las credenciales en `application.properties`:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/recursos_humanos_db?createDatabaseIfNotExist=true
     spring.datasource.username=tu_usuario
     spring.datasource.password=tu_contraseña
     spring.jpa.hibernate.ddl-auto=update
     ```

3. **Configurar el proyecto en IntelliJ IDEA**:
   - Abrir el proyecto en IntelliJ IDEA.
   - Asegurarse de que el SDK de Java 17 está seleccionado.
   - Construir el proyecto usando Maven (`mvn clean install`).

4. **Ejecutar la aplicación**:

   ```bash
   mvn spring-boot:run
   ```

   O desde IntelliJ IDEA:
   - Ejecutar la clase `RhApplication.java`.

5. **Acceder a la API**:
   - La aplicación correrá en `http://localhost:8090`.
   - Puedes usar herramientas como **Postman** o **cURL** para probar los endpoints.

## Endpoints Principales

| Método | Endpoint          | Descripción |
|---------|------------------|-------------|
| GET     | `/empleados`      | Obtener todos los empleados |
| GET     | `/empleados/{id}` | Obtener un empleado por ID |
| POST    | `/empleados`      | Agregar un nuevo empleado |
| PUT     | `/empleados/{id}` | Editar un empleado |
| DELETE  | `/empleados/{id}` | Eliminar un empleado |

## Estructura del Proyecto

```
Proyecto-Sistema-Empleados-Spring/
├── src/main/java/com/example/rh/
│   ├── controllers/
│   ├── entities/
│   ├── repositories/
│   ├── services/
│   ├── exception/
│   ├── RhApplication.java
├── src/main/resources/
│   ├── application.properties
├── pom.xml
└── README.md
```

- **`controller/`**: Contiene las clases que manejan las peticiones HTTP.
- **`model/`**: Contiene las entidades que representan la estructura de datos.
- **`repository/`**: Contiene las interfaces para interactuar con la base de datos.
- **`service/`**: Contiene la lógica de negocio.
- **`application.properties`**: Archivo de configuración de la aplicación.
- **`pom.xml`**: Archivo de dependencias del proyecto.

## Contribución

Si deseas contribuir al proyecto:

1. Realiza un fork del repositorio.
2. Crea una nueva rama (`git checkout -b feature/nueva-funcionalidad`).
3. Realiza tus cambios y haz commit (`git commit -m 'Agregar nueva funcionalidad'`).
4. Sube tus cambios (`git push origin feature/nueva-funcionalidad`).
5. Abre una Pull Request.

## Licencia

Este proyecto está bajo la Licencia MIT. Consulta el archivo [LICENSE](LICENSE) para más detalles.

## Contacto

Para preguntas o soporte, puedes contactarme a través de [3reehuy@gmail.com](mailto:3reehuy@gmail.com).

---
