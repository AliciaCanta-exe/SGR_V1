'use strict';

angular.module('modContenidoDidactico_rmpp').controller('ContenidoDidacticoController', ['$scope', 'MallasService', function($scope, MallasService) {

	var self = this;
    self.usuario={email:'',clave:''};
    self.usuarios=[];

    self.submit = submit;
    self.reset 	= reset;

    function autentication(usuario){
    	
    	UsuariosService.autentication(usuario)
	    	.then(
            function(d) {
                //self.usuarios = d;
                console.log('TRACE-CONTROLLER: Dirigiendose al servicio con el usuario'+usuario.email);
            },
            function(errResponse){
                console.error('ERROR-CONTROLLER: Error while fetching Usuarios');
            }
	        );
    }
    
    function submit() {    	
	    console.log('TRACE-CONTROLLER: Iniciando autenticación del usuario', self.usuario);
	    autentication(self.usuario)
        reset();
    }

    //reset Form
    function reset(usario){
        self.usuario={email:'',clave:''};
        $scope.myForm.$setPristine(); 
    }

}]);
