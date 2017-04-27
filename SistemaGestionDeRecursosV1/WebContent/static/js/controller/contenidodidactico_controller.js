'use strict';

angular.module('contenidoDidactico_rmpp').controller('ContenidoDidacticoRMPP_Controller', ['$scope', 'ContenidoDidacticoRMPP_Service', function($scope, ContenidoDidacticoRMPP_Service) {

	var self = this;
    self.malla={anio:'',codigo:''};
    self.cursos=[];

    self.submit = submit;
    self.reset 	= reset;
    

    function listCursosMalla(malla){
    	ContenidoDidacticoRMPP_Service.listCursosMalla(malla).then(
    	    function(d){
    	    	self.cursos = d;
    	    },
			function(errResponse){
				console.error('Error al listar los cursos de la malla');
			});
    }
    
    function submit(){
    	if(self.malla.anio){
    		console.log('Iniciando busqueda....', self.malla.anio);
    		listCursosMalla(self.malla);
    	}else{
    		console.error('No hay datos para iniciar busqueda de malla');
    	}
    	reset();
    }
    
    function reset(){
        self.malla={anio:'',codigo:''};
        $scope.myFormMalla.$setPristine(); //reset Form
    }

}]);


