var restController=(function(){
alert('ENTRO AL REST');
var getPeliculas=function(peli,year,callback){
    axios.get('/movie/'+peli+"/"+year)		
		.then(function(response){
			callback.onSuccess(response.data);			
		})
		.catch(function(error){
			callback.onFailed(error);
		});
	};
return{
getPeliculas:getPeliculas
};
})();