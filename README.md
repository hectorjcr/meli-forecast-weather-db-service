# meli-forecast-weather-db-service
API RESTful encargada de la gestión de la base de datos de control climático de la galaxia

## Descripción de la API

| URL               | https://meli-forecast-db-microservice.herokuapp.com/api/v1/forecast/day/{day}  |
| ----------        | ------------------------------- |
| __API__            | /api/v1/forecast/day/{day} |
| __Método__            | GET                     |
| __Produces__          | application/json        |
| __Consumes__          | application/json        |
| __Path Parametes__    | {day} = dia a consultar |
| __Response Status__   | 200 OK - OK             |
| __Response Object__   | ExplicitDayForecast     |
| __Descripcion__       | Devuelve las condiciones del clima de un dia especifico |

---

| URL               | https://meli-forecast-db-microservice.herokuapp.com/api/v1/forecast/weather/{weather} |
| ----------        | ------------------------------- |
| __API__            | /api/v1/forecast/weather/{weather} |
| __Método__            | GET                             |
| __Produces__          | application/json                |
| __Consumes__          | application/json                |
| __Path Parameter__       | weather = clima a consultar  |
| __Response Status__   | 200 OK - OK                     |
| __Response Object__   | List of ExplicitDayForecast     |
| __Descripcion__       | Guarda un registro de clima para un dia especifico |

---

| URL               | https://meli-forecast-db-microservice.herokuapp.com/api/v1/forecast/totalrows |
| ----------        | ------------------------------- |
| __API__            | /api/v1/forecast/totalrows |
| __Método__            | GET                             |
| __Produces__          | application/json                |
| __Consumes__          | application/json                |
| __Path Parameter__       | weather = clima a consultar  |
| __Response Status__   | 200 OK - OK                     |
| __Response Object__   | String     |
| __Descripcion__       | Devuelve el numero de registros las predicciones climaticas |

### URLs del microservicio
    Direccion de la aplicacion desplegada en Heroku
		    https://meli-forecast-db-microservice.herokuapp.com/
        
	  Direccion del repositorio en heroku para ser clonado
		    https://git.heroku.com/meli-forecast-db-microservice.git
        
	  Direccion del repositorio en GitHub para ser clonado o ver su codigo en linea
		    https://github.com/hectorjcr/meli-forecast-weather-db-service.git
        
	  Direccion de la documentacion para la API REST
		    https://meli-forecast-db-microservice.herokuapp.com/jsondoc-ui.html
        

			dentro de la barra de busqueda ingresar esta direccion: https://meli-forecast-db-microservice.herokuapp.com/jsondoc

