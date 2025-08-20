# microservices-common

Este módulo contiene clases y utilidades comunes para microservicios Java, permitiendo evitar duplicación de código y facilitar la reutilización en distintos proyectos..

## ¿Qué incluye?

- **DTOs genéricos**: Clases base para respuestas, errores y paginación.
- **Excepciones personalizadas**: Excepciones estándar para lógica de negocio y validaciones.
- **Utilidades**: Métodos para construir respuestas estándar.

## Instalación

1. Compila e instala el JAR en tu repositorio local de Maven:

   ```
   mvn clean install
   ```

2. Agrega la dependencia en el `pom.xml` de tu microservicio:

   ```xml
   <dependency>
       <groupId>com.ejdev</groupId>
       <artifactId>microservices-common</artifactId>
       <version>1.0.0</version>
   </dependency>
   ```

## Uso

### Ejemplo de excepción personalizada

```java
throw new NotFoundException("El recurso no existe");
```

### Ejemplo de respuesta estándar

```java
BaseResponse<String> response = ResponseBuilder.success("Operación exitosa", "dato");
```

## Pruebas

Ejecuta los tests con:

```
mvn test
```

## Notas

- Este módulo **no depende de frameworks** como Spring, por lo que puedes usarlo en cualquier proyecto Java.
- Los handlers globales de excepciones deben implementarse en cada microservicio según el framework que utilices.

---

