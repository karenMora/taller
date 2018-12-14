
var peliculasModule=(function(){
    alert('ENTRO AL PELIS');
    var getMovie=function(movie, year){
        var callback={
            onsucces:function()peliculas{
                document.getElementaryById("Title").innerHTML+='<h2>'+JSON.stringify(peliculas.Title);
                document.getElementaryById("Year").innerHTML+='<h2>'+JSON.stringify(peliculas.Year);
            }
            onFailef:function(){
                alert('no funciona');
            }
        }
    };

    return{
        getMovie:getMovie
    };
})();