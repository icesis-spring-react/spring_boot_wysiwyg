# spring_boot_wysiwyg

## Integrantes:

- Sebastián Hidalgo
- Dennis Masso Macías
- Yuluka Gigante
- Sebastián García

## Cómo usar el proyecto

Para usar el poryecto, basta con ejecutarlo desde el IDE de preferencia (IntlliJ preferiblemente). 

Una vez hecho esto, dirigirse a Postman y empezar a hacer las solicitudes a los endpoints:

  Para los relacionados con las películas, las rutas inician con localhost:8080/movies. Los enlaces para de entrar a los endpoints son:

  - /all (GET): para ver todas las películas creadas.
  - /add (POST): para agregar una película.
    
    Se debe agregar la película por medio de un JSON. La estructura es:
    {
    "name" : "Test 2",
    "genre" : "K-Drama",
    "directorId" : 3,
    "releaseDate":"2023-11-13T05:00:00.000+00:00"
    }

  - /{id} (GET): para buscar una película por id.
  - /update/{id} (PUT): para actualizar la película con el id pasado en el enlace.
  - /delete/{id} (DELETE): para eliminar la película con el id pasado en el enlace.

  Para los relacionados con los directores, las rutas inician con localhost:8080/directors. Los enlaces para de entrar a los endpoints son:

  - /all (GET): para ver todas los directores creados.
  - /add (POST): para agregar un director.
    
    Se debe agregar la película por medio de un JSON. La estructura es:
    {
    "name" : "Scorsese"
    }

  - /{id} (GET): para buscar un director por id.
  - /update/{id} (PUT): para actualizar el director con el id pasado en el enlace.
  - /delete/{id} (DELETE): para eliminar al director con el id pasado en el enlace.
  - /{id}/movies (GET): para obtener todas las películas cuyo director tenga el id pasado en el enlace.
