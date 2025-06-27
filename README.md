# 📚 literAlura

**Solución al Challenge Java Back-End del programa Oracle Next Education (ONE) – Alura Latam**

`literAlura` es una aplicación de biblioteca desarrollada en Java que permite consultar, registrar y gestionar libros utilizando la API pública de **Gutendex**. El proyecto utiliza **Spring Boot**, **Hibernate (JPA)** y **PostgreSQL** como tecnologías principales.

---

## 🚀 Características

- 🔍 **Búsqueda de libros** por título desde la API de Gutendex.
- 📥 **Registro automático de libros y autores** en una base de datos local.
- ❌ **Evita duplicados** de libros ya registrados.
- 📋 Menú de consola interactivo con opciones como:
  1. Listar todos los libros registrados.
  2. Listar todos los autores registrados.
  3. Consultar autores vivos en un año específico.
  4. Filtrar libros por idioma.

---

## 🧰 Tecnologías utilizadas

- **Lenguaje:** Java 17
- **Framework:** Spring Boot
- **ORM:** Hibernate / JPA
- **Base de datos:** PostgreSQL
- **Cliente HTTP:** RestTemplate / WebClient (según implementación)
- **Fuente de datos:** [Gutendex API](https://gutendex.com/)

---

## 🛠️ Instalación y uso

### 1. Clonar el repositorio
```bash
git clone https://github.com/JebGy/literalura.git
cd literalura
```

### 2. Configurar la base de datos PostgreSQL
Asegúrate de tener PostgreSQL instalado y crea una base de datos, por ejemplo:
```sql
CREATE DATABASE literalura;
```

Actualiza las credenciales en `src/main/resources/application.properties`:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/literalura
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
```

### 3. Ejecutar la aplicación
Abre el proyecto en tu IDE Java favorito (IntelliJ, Eclipse, etc.) y ejecuta la clase principal:

```java
com.literalura.LiteraluraApplication
```

### 4. Interactuar con el sistema
Usa el menú en consola para buscar libros, listar autores o filtrar por idioma.

---

## 📦 Estructura del proyecto

```
literalura/
├── src/
│   ├── main/
│   │   ├── java/com/literalura/
│   │   └── resources/
│   │       └── application.properties
├── pom.xml
└── README.md
```

---

## 🌐 API externa utilizada

- [Gutendex API](https://gutendex.com/)
  - Permite obtener datos públicos de libros del Proyecto Gutenberg.

---

## 👨‍💻 Autor

- 💡 Proyecto desarrollado por [JebGy](https://github.com/JebGy) como parte del programa **Oracle Next Education (ONE)** de **Alura Latam**.

---

## 🏷️ Etiquetas

`java` • `spring-boot` • `postgresql` • `jpa` • `gutendex` • `alura` • `oracle-next-education` • `backend-challenge`
