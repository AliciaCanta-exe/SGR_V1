'use strict';

angular.module('myLogin').factory('UsuariosService', ['$http', '$q', function($http, $q){
	
	var URL_APP = 'http://sistemagestionderecursosv1.mybluemix.net';    //NUBE
	//var URL_APP = 'http://localhost:8082/SistemaGestionDeRecursosV1'; //LOCAL
		
    var REST_SERVICE_URI = URL_APP+'/autentication/';

    var factory = {
    		
    	  autentication:autentication
    };

    return factory;

    function autentication(usuario) {
        var deferred = $q.defer();
        
        console.log('TRACE-SERVICE: Valores enviados al back.....'+usuario.email + " - "+usuario.clave);
        
        $http.post(REST_SERVICE_URI, usuario).then(
            function (response) {
                deferred.resolve(response.data);
                if (response.data.dni != null) {                	
                	//console.log('TRACE-SERVICE: Front to Back'+response.data.dni + " - "+response.status);
                    window.location.href = "http://localhost:8082/SistemaGestionDeRecursosV1/views/menu.jsp";
                }
            },
            function(errResponse){
                console.error('ERROR-SERVICE: An error occurred while validating user' +errResponse);
                deferred.reject(errResponse );
            }
        );
        return deferred.promise;
    }
    
}]);
