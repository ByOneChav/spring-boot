# 🚀 Aprendiendo Spring Boot (Autodidacta) 🌱

> Este repositorio es mi bitácora de aprendizaje en **Spring Boot** de forma **autónoma**.  
> Aquí practico el patrón **MVC (Model–View–Controller)**, APIs REST, validaciones, seguridad, base de datos y más. 💻✨

---

## 🧠 Objetivos
- Entender la arquitectura **MVC** en Spring Boot 🧩
- Crear **APIs REST** completas (CRUD) 🔁
- Conectar con **Base de Datos** (JPA/Hibernate) 🗄️
- Manejar **validaciones** y **errores** correctamente ✅🧯
- Documentar con **Swagger / OpenAPI** 📄
- Probar endpoints con **Postman** 🧪
- Aprender **Seguridad** (Spring Security + JWT) 🔐
- Buenas prácticas (DTOs, capas, SOLID) 🧱

---

## 🏗️ ¿Qué es MVC en Spring Boot? 🧭
Spring Boot soporta MVC para separar responsabilidades:

- **Model 🧾**: Entidades/DTOs y lógica del dominio (datos).
- **View 🖼️**: Vistas (Thymeleaf) o la “respuesta” JSON si es REST.
- **Controller 🎮**: Recibe requests HTTP y coordina la respuesta.
- **Service ⚙️**: Reglas de negocio (intermedio entre Controller y Repository).
- **Repository 🗃️**: Acceso a datos (JPA/Hibernate).

---

## 📁 Estructura típica del proyecto
```bash
src/
 └─ main/
    ├─ java/com/tuapp/
    │  ├─ controller/ 🎮
    │  ├─ service/ ⚙️
    │  ├─ repository/ 🗃️
    │  ├─ model/ 🧾
    │  ├─ dto/ 📦
    │  ├─ exception/ 🧯
    │  └─ config/ 🧩
    └─ resources/
       ├─ application.properties ⚙️
       ├─ templates/ (Thymeleaf) 🖼️
       └─ static/ (CSS/JS/img) 🎨
