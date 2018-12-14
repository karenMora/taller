# RECUPERACION EXAMEN FINAL

# Enunciado
Su compañía lo ha seleccionado para construir una aplicación que demuestre una simple arquitectura de Microservicios desplegada en Heroku para uno de los clientes más importantes.
Así, han decidido que usted debe construir una aplicación para consultar películas.  La aplicación recibirá el nombre y/o fecha y creará una lista de las películas consultadas. La aplicación mostrará los datos de las películas incluyendo el poster, y adicionará cada búsqueda encima de la otra.  Para esto utilice el API gratuito de http://www.omdbapi.com/ (Puede crear una cuenta para obtener la llave para realizar consultas). Se le pide que su implementación sea eficiente en cuanto a recursos así que debe implementar un Caché que permita evitar hacer consultas repetidas al API externo. 

La arquitectura debe tener las siguientes características.
- El cliente Web debe ser un cliente asíncrono que use servicios REST desplegados en Heroku y use Json como formato para los mensajes.
- El servidor de Heroku servirá como un gateway para encapsular llamadas a otros servicios Web externos.
- La aplicación debe ser multiusuario.
- Todos los protocolos de comunicación serán sobre HTTP.
- Los formatos de los mensajes de intercambio serán siempre JSON.
- La interfaz gráfica del cliente debe ser los más limpia y agradable posible. Para invocar métodos REST desde el cliente usted puede utilizar la tecnología que desee.
- Debe construir un cliente Java que permita probar las funciones tanto el servidor fachada. El cliente utiliza simples conexiones http para conectarse a los servicios. Este cliente debe hacer pruebas de concurrencia en su servidor Spring.
- La fachada de servicios tendrá un caché que permitirá que llamados que ya se han realizado a las implementaciones concretas con parámetros específicos no se realicen nuevamente. Puede almacenar el llamado como un String con su respectiva respuesta, y comparar el string respectivo. Recuerde que el caché es una simple estructura de datos.
- Se debe poder extender fácilmente, por ejemplo, es fácil agregar nuevas funcionalidades, o es fácil cambiar el proveedor de una funcionalidad.
- Debe utilizar maven para gestionar el ciclo de vida, git y github para almacenar al código fuente y heroku como plataforma de producción.

# ARQUITECTURA
la arquitectura es cliente-servidor, manejando un cliente web y a heroku como el servidor que hace peticones a un api de http://omdbapi.com/ la cual entrega una llave para poder acceder a los datos de las peliculas y poder visualizarnos en el cliente web

[](ARQ.png?raw=true "")

# heroku
https://floating-falls-95919.herokuapp.com/

https://git.heroku.com/floating-falls-95919.git

# GIT 
https://github.com/karenMora/taller

# By
- karen Mora

