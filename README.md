# Simple OAuth 2.0 Spring Security
Esta es una aplicación simple que permite a un usuario iniciar sesión 
por medio de una aplicación frontend como angular o react.

## JWT
Utiliza JSON Web Token como medio de transporte para la información 
de inicio de sesión y detalles del usuario.

## MySQL
Para que la aplicación arranque, es necesario tener una instancia de MySQL 5.6
en local (o externa), con los permisos suficientes para que la aplicación 
genere el esquema de base de datos en cada arranque.

### Conexión
La conexión se encuentra configurada en el archivo `application.properties` 
en las cadenas:
``` properties
spring.datasource.url=jdbc:mysql://localhost:3306/springtest
spring.datasource.username=spring
spring.datasource.password=test
spring.jpa.hibernate.ddl-auto=create-drop
```

## Aplicación y Usuario de prueba
Para concepto de pruebas, la aplicación se registra de manera estática,
pudiendo hacerlo de forma dinámica extendiendo algunas funcionalidades 
de Spring, obteniendo desde base de datos la información de las aplicaciones clientes.

La aplicación registrada es:
- Nombre: angularapp
- Contraseña: 12345

El usuario base es:
- Usuario: admin
- Contraseña: 12345

### Ejemplo para PostMan
Puede importar el siguiente ejemplo en Postman para obtener el token
de autorización:

```plain
curl --location --request POST 'http://localhost:8080/oauth/token' \
--header 'Content-Type: application/x-www-form-urlencoded' \
--header 'Authorization: Basic YW5ndWxhcmFwcDoxMjM0NQ==' \
--form 'grant_type="password"' \
--form 'clientid="angularapp"' \
--form 'username="admin"' \
--form 'password="12345"'
```

El resultado de la consulta será:
```json
{
    "access_token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE2MTI4OTkyMjAsInVzZXJfbmFtZSI6ImFkbWluIiwiYXV0aG9yaXRpZXMiOlsiUk9MRV9BRE1JTiIsIlJPTEVfVVNFUiJdLCJqdGkiOiI2ZTU3OTdjYi0yNThlLTQyZGUtYjA0Yi02ODNhOTM0ZDEzNjIiLCJjbGllbnRfaWQiOiJhbmd1bGFyYXBwIiwic2NvcGUiOlsicmVhZCIsIndyaXRlIl19.mXBezUjoswteufHFND-DRlZEP7_J8Isb2g4zd0RAC3k",
    "token_type": "bearer",
    "refresh_token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX25hbWUiOiJhZG1pbiIsInNjb3BlIjpbInJlYWQiLCJ3cml0ZSJdLCJhdGkiOiI2ZTU3OTdjYi0yNThlLTQyZGUtYjA0Yi02ODNhOTM0ZDEzNjIiLCJleHAiOjE2MTI4OTkyMjAsImF1dGhvcml0aWVzIjpbIlJPTEVfQURNSU4iLCJST0xFX1VTRVIiXSwianRpIjoiMWUxMGExNjktN2ZjOC00Y2M3LWJkMDItYzUyMWE4OTJiMDc4IiwiY2xpZW50X2lkIjoiYW5ndWxhcmFwcCJ9.NcyQDZrlmAIuWmKQHf_dHjUafqSfUtakVS8dEgt0T4M",
    "expires_in": 3599,
    "scope": "read write",
    "jti": "6e5797cb-258e-42de-b04b-683a934d1362"
}
```