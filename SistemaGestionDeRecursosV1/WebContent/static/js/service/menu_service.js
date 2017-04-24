'use strict';

angular.module('myMenu').factory('MenuService', ['$http', '$q', function($http, $q){

    var REST_SERVICE_URI = 'http://localhost:8082/SistemaGestionDeRecursosV1/menu/';

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
