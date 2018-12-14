var restController=(function(){
alert('ENTRO AL REST');
var getPeliculas=function(peli,callback){
    axios.get('/movie/'+title+"/"+year)		
		.then(function(response){
			callback.onSuccess(response.data);			
		})
		.catch(function(error){
			callback.onFailed(error);
		});
	};
};

return{
getPeliculas:getPeliculas
};
})();