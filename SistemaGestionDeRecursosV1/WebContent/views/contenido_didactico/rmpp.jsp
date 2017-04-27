<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>  
    <title>Registro de Material Propuesto Preliminar</title>  
    
      <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.js"></script>
      <script src="<c:url value='/static/js/app.js' />"></script>
      <script src="<c:url value='/static/js/service/contenidodidactico_service.js' />"></script>
      <script src="<c:url value='/static/js/controller/contenidodidactico_controller.js' />"></script>
          
    <style>
      .username.ng-valid {
          background-color: lightgreen;
      }
      .username.ng-dirty.ng-invalid-required {
          background-color: red;
      }
      .username.ng-dirty.ng-invalid-minlength {
          background-color: yellow;
      }

      .email.ng-valid {
          background-color: lightgreen;
      }
      .email.ng-dirty.ng-invalid-required {
          background-color: red;
      }
      .email.ng-dirty.ng-invalid-email {
          background-color: yellow;
      }

    </style>
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
     <link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
  </head>
  <body ng-app="contenidoDidactico_rmpp" class="ng-cloak">
      <div class="generic-container" ng-controller="ContenidoDidacticoRMPP_Controller as ctrl">
          <div class="panel panel-default">
              <div class="panel-heading"><span class="lead">Registrar el Material Propuesto Preliminar</span></div>
              <div class="formcontainer">
                  <form ng-submit="ctrl.submit()" name="myFormMalla" class="form-horizontal">                      
                      <div class="row">
                          <div class="form-group col-md-12">
                              <label class="col-md-2 control-lable" for="file">Año</label>
                              <div class="col-md-7">
                                  <input type="text" ng-model="ctrl.malla.anio" name="anio" class="username form-control input-sm" placeholder="Ingrese el año" required ng-minlength="4"/>
                                  <div class="has-error" ng-show="myFormMalla.$dirty">
                                      <span ng-show="myFormMalla.anio.$error.required">Este campo es obligatorio</span>
                                      <span ng-show="myFormMalla.anio.$error.minlength">Cantidad mínima, 4 digitos numericos</span>
                                  </div>
                              </div>
                          </div>
                      </div>
                      <div class="row">
                          <div class="form-group col-md-12">
                              <label class="col-md-2 control-lable" for="file">Codigo</label>
                              <div class="col-md-7">
                                  <input type="text" ng-model="ctrl.malla.codigo" class="form-control input-sm" placeholder="Codigo Malla"/>
                              </div>
                          </div>
                      </div>
                      <div class="row">
                          <div class="form-actions floatRight">
                              <input type="submit"  value="Buscar" class="btn btn-primary btn-sm" ng-disabled="myFormMalla.$invalid">                              
                          </div>
                      </div>
                      
    <select name="repeatSelect" id="repeatSelect" ng-model="data.model">
      <option ng-repeat="option in data.availableOptions" value="{{ctrl.cursos.cursoId}}">{{ctrl.cursos.nombre}}</option>
    </select>  
<!--     <select name="singleSelect" id="singleSelect" ng-model="data.singleSelect">
      <option value="">---Please select---</option> not selected / blank option
      <option ng-repeat="option in data.availableOptions" value="{{ctrl.cursos.cursoId}}">{{ctrl.cursos.nombre}}</option> interpolation
    </select>   -->                      
                  </form>
              </div>
          </div>
          
          
          <div class="panel panel-default">
                <!-- Default panel contents -->
              <div class="panel-heading"><span class="lead">Lista de Recursos del Tema</span></div>
              <div class="tablecontainer">
                  <table class="table table-hover">
                      <thead>
                          <tr>
                              <th>Videos</th>
                              <th>Imagenes</th>
                              <th>Enlaces</th>
                              <th width="20%"></th>
                          </tr>
                      </thead>
<!--                       <tbody>
                          <tr ng-repeat="u in ctrl.users">
                              <td><span ng-bind="u.id"></span></td>
                              <td><span ng-bind="u.username"></span></td>
                              <td><span ng-bind="u.address"></span></td>
                              <td><span ng-bind="u.email"></span></td>
                              <td>
                              <button type="button" ng-click="ctrl.edit(u.id)" class="btn btn-success custom-width">Edit</button>  <button type="button" ng-click="ctrl.remove(u.id)" class="btn btn-danger custom-width">Remove</button>
                              </td>
                          </tr>
                      </tbody> -->
                  </table>
              </div>
          </div>
      </div>
      

  </body>
</html>