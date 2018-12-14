
var peliculasModule=(function(){
    alert('ENTRO AL PELIS');

    var getMovie=function(peli, year){
        var callback = {
            onsucces:function(peliculas){
                docuement.getElementaryById('namePeli').value;
                docuement.getElementaryById('añoPeli').value;
            },
            onFailef:function(){
                alert('no funciona');
            }
        }
    restController.getPeliculas(peli,year,callback);
    };
    
    return{
        getMovie:getMovie
    };
})();