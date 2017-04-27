'use strict';

var URI = 'http://localhost:8082/SistemaGestionDeRecursosV1';

angular.module('contenidoDidactico_rmpp').factory('ContenidoDidacticoRMPP_Service', ['$http', '$q', function($http, $q){
	
	
    var REST_SERVICE_MALLA = URI+'/listCursos/';

    var factory = {
    	  listCursosMalla:listCursosMalla
    };

    return factory;
      
    
    function listCursosMalla(malla){
    	var deferred = $q.defer();
    	console.log('......................enviado al backEnd'+malla);
    	$http.post(REST_SERVICE_MALLA, malla).then(
    			function(response){
    				deferred.resolve(response.data)
    				console.log('TRACE-ContenidoDidactico_Service: Data que devuelve'+response.data);

    			},
    			function(errResponse){
    				console.error('ERROR-ContenidoDidactico_Service: Al listar los cursos');
    				deferred.reject(errResponse);
    			})
    	
    }
    
}]);
