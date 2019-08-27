## Servicios para paises

Lo primero sera acceder al localhost en el puerto 8082.

## Servicios GET
* #### Servicio para consultar país por ID
  /api/countries/id/{id_pais}
* #### Servicio para consutar paises por continente
  /api/countries/continent/name/{continent_name}
  
## Servicios POST
* #### Servicio para crear nuevos paises
  /api/countries/new
  Dentro de la petición post hay que agregar dentro de los Headers el Content-Type como application/json, y con la siguiente estructura en   el body
  ```
    {
      "name": "name_pais",
      "capital": "capital_pais",
      "continent": "continent_pais"
    }
  ```
  
  ## Notas
  * Solo para MySQL Funcionando.
  * Agregando para Mongo y otras bases de datos.
