<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="en"><head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="robots" content="noindex">

    <title>Menu - Bootsnipp.com</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
     <link href="css/menu.css" rel="stylesheet" id="bootstrap-css">
    <script src="//code.jquery.com/jquery-1.10.2.min.js"></script>
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
    <script type="text/javascript">
        window.alert = function(){};
        var defaultCSS = document.getElementById('bootstrap-css');
        function changeCSS(css){
            if(css) $('head > link').filter(':first').replaceWith('<link rel="stylesheet" href="'+ css +'" type="text/css" />'); 
            else $('head > link').filter(':first').replaceWith(defaultCSS); 
        }
        $( document ).ready(function() {
          var iframe_height = parseInt($('html').height()); 
          window.parent.postMessage( iframe_height, 'http://bootsnipp.com');
        });
    </script>
</head>
<body cz-shortcut-listen="true" id="home">
	
	<div align="center">
        <h2>Bienvenido ${usuarios.email} al Sistema de Gestion de Recursos!</h2>
    </div>
	
	
		<link rel="stylesheet" type="text/css" media="screen" href="http://www.transparencia.pr.gov.br/pte/resources/css/app-portal.css" title="default">
		<link rel="alternate stylesheet" type="text/css" media="screen" href="http://www.transparencia.pr.gov.br/pte/resources/css/contrast-portal.css" title="high-contrast-w-b">
	
	
		<div id="j_idt32" class="ui-dialog ui-widget ui-widget-content ui-corner-all ui-shadow ui-hidden-container dialog-loader text-center" role="dialog" aria-labelledby="j_idt32_title" aria-hidden="true" style="width: auto; height: auto;">
			<div class="ui-dialog-content ui-widget-content" style="height: auto;">
				<img id="j_idt33" src="http://www.transparencia.pr.gov.br/pte/javax.faces.resource/images/ajax_loader.gif.jsf" alt="" class="icon-loader">
				<h2>Aguarde...</h2>
			</div>
		</div>
		<form id="formPrincipal" name="formPrincipal" method="post" action="http://www.transparencia.pr.gov.br/pte/home?windowId=267" accept-charset="ISO-8859-1" enctype="application/x-www-form-urlencoded">
			<section id="page-inicio" class="page" style="height: 687px;">
				<div id="formPrincipal:j_idt37" class="bg-cover-fade"><img id="formPrincipal:j_idt38" src="http://www.transparencia.pr.gov.br/pte/resources/images/bg-cover-1.jpg?pfdrid_c=true" alt="" style="position: absolute; top: 0px; left: 0px; display: block; z-index: 4; opacity: 0.964502; width: 1920px; height: 601px;"><img id="formPrincipal:j_idt39" src="http://www.transparencia.pr.gov.br/pte/resources/images/bg-cover-2.jpg?pfdrid_c=true" alt="" style="position: absolute; top: 0px; left: 0px; display: block; z-index: 5; opacity: 0.0354983; width: 1920px; height: 601px;"><img id="formPrincipal:j_idt40" src="http://www.transparencia.pr.gov.br/pte/resources/images/bg-cover-3.jpg?pfdrid_c=true" alt="" style="position: absolute; top: 0px; left: 0px; display: none; z-index: 4; opacity: 0; width: 1920px; height: 601px;"><img id="formPrincipal:j_idt41" src="http://www.transparencia.pr.gov.br/pte/resources/images/bg-cover-4.jpg?pfdrid_c=true" alt="" style="position: absolute; top: 0px; left: 0px; display: none; z-index: 4; opacity: 0; width: 1920px; height: 601px;"></div>
				<div id="conteudo-inicio" class="container-fluid">
					<div class="container-menu-principal">
						<div class="caixa-icones">
							<p id="explicacao2">&nbsp;</p>
							<ul id="list-icones">
								<li class="item-icone">
									<a href="#" class="icone dropdown-toggle" data-toggle="dropdown">
									<img src="http://www.transparencia.pr.gov.br/pte/resources/images/icon-tema-orcamento.png" alt="PLANEJAMENTO E ORÃAMENTO" class="icone-tema">
									<span>CURRICULA</span>
									</a>
									<div class="arrow-tema-icones"></div>
									<ul class="submenu dropdown-menu" role="menu">
										<li>
											<ul class="submenu dropdown-menu" role="menu">
											</ul>
											<a href="http://www.transparencia.pr.gov.br/pte/assunto/2/25?origem=3" class="ui-link ui-widget link-menu" target="_self">
											<i class="fa fa-arrow-right"></i>&nbsp; Curricula 1
											</a>
										</li>
										<li>
											<ul class="submenu dropdown-menu" role="menu">
											</ul>
											<a href="http://www.transparencia.pr.gov.br/pte/assunto/2/52?origem=3" class="ui-link ui-widget link-menu" target="_self">
											<i class="fa fa-arrow-right"></i>&nbsp; Curricula 2
											</a>
										</li>
										<li>
											<ul class="submenu dropdown-menu" role="menu">
											</ul>
											<a href="http://www.transparencia.pr.gov.br/pte/assunto/2/14?origem=3" class="ui-link ui-widget link-menu" target="_self">
											<i class="fa fa-arrow-right"></i>&nbsp; Curricula 3
											</a>
										</li>
										<li>
											<ul class="submenu dropdown-menu" role="menu">
											</ul>
											<a href="http://www.transparencia.pr.gov.br/pte/assunto/2/6?origem=3" class="ui-link ui-widget link-menu" target="_self">
											<i class="fa fa-arrow-right"></i>&nbsp; Curricula 4
											</a>
										</li>
										<li>
											<ul class="submenu dropdown-menu" role="menu">
											</ul>
											<a href="http://www.transparencia.pr.gov.br/pte/assunto/2/24?origem=3" class="ui-link ui-widget link-menu" target="_self">
											<i class="fa fa-arrow-right"></i>&nbsp; Curricula 5
											</a>
										</li>
									</ul>
								</li>
								<li class="item-icone">
									<a href="#" class="icone dropdown-toggle" data-toggle="dropdown">
									<img src="http://www.transparencia.pr.gov.br/pte/resources/images/icon-tema-receitas.png" alt="RECEITAS" class="icone-tema">
									<span>EVALUACION DE CURRICULAS</span>
									</a>
									<div class="arrow-tema-icones"></div>
									<ul class="submenu dropdown-menu" role="menu">
										<li>
											<ul class="submenu dropdown-menu" role="menu">
											</ul>
											<a href="http://www.transparencia.pr.gov.br/pte/assunto/3/3?origem=3" class="ui-link ui-widget link-menu" target="_self">
											<i class="fa fa-arrow-right"></i>&nbsp; Evaluación 1
											</a>
										</li>
										<li>
											<ul class="submenu dropdown-menu" role="menu">
											</ul>
											<a href="http://www.transparencia.pr.gov.br/pte/assunto/3/27?origem=3" class="ui-link ui-widget link-menu" target="_self">
											<i class="fa fa-arrow-right"></i>&nbsp;  Evaluación 2
											</a>
										</li>
										<li>
											<ul class="submenu dropdown-menu" role="menu">
											</ul>
											<a href="http://www.transparencia.pr.gov.br/pte/assunto/3/21?origem=3" class="ui-link ui-widget link-menu" target="_self">
											<i class="fa fa-arrow-right"></i>&nbsp;  Evaluación 3
											</a>
										</li>
										<li>
											<ul class="submenu dropdown-menu" role="menu">
											</ul>
											<a href="http://www.transparencia.pr.gov.br/pte/assunto/3/4?origem=3" class="ui-link ui-widget link-menu" target="_self">
											<i class="fa fa-arrow-right"></i>&nbsp;  Evaluación 4
											</a>
										</li>
									</ul>
								</li>
								<li class="item-icone">
									<a href="#" class="icone dropdown-toggle" data-toggle="dropdown">
									<img src="http://www.transparencia.pr.gov.br/pte/resources/images/icon-tema-despesas.png" alt="DESPESAS" class="icone-tema">
									<span>CONSULTAS</span>
									</a>
									<div class="arrow-tema-icones"></div>
									<ul class="submenu dropdown-menu" role="menu">
										<li>
											<ul class="submenu dropdown-menu" role="menu">
											</ul>
											<a href="http://www.transparencia.pr.gov.br/pte/assunto/4/22?origem=3" class="ui-link ui-widget link-menu" target="_self">
											<i class="fa fa-arrow-right"></i>&nbsp; Consulta 1
											</a>
										</li>
										<li>
											<ul class="submenu dropdown-menu" role="menu">
											</ul>
											<a href="http://www.transparencia.pr.gov.br/pte/assunto/4/28?origem=3" class="ui-link ui-widget link-menu" target="_self">
											<i class="fa fa-arrow-right"></i>&nbsp; Consulta 2
											</a>
										</li>
										<li>
											<ul class="submenu dropdown-menu" role="menu">
											</ul>
											<a href="http://www.transparencia.pr.gov.br/pte/assunto/4/30?origem=3" class="ui-link ui-widget link-menu" target="_self">
											<i class="fa fa-arrow-right"></i>&nbsp; Consulta 3
											</a>
										</li>
										<li>
											<ul class="submenu dropdown-menu" role="menu">
											</ul>
											<a href="http://www.transparencia.pr.gov.br/pte/assunto/4/49?origem=3" class="ui-link ui-widget link-menu" target="_self">
											<i class="fa fa-arrow-right"></i>&nbsp; Consulta 4
											</a>
										</li>
									</ul>
								</li>
								<li class="item-icone">
									<a href="#" class="icone dropdown-toggle" data-toggle="dropdown">
									<img src="http://www.transparencia.pr.gov.br/pte/resources/images/icon-tema-pessoal.png" alt="PESSOAL" class="icone-tema">
									<span>GESTION PERMISOS</span>
									</a>
									<div class="arrow-tema-icones"></div>
									<ul class="submenu dropdown-menu" role="menu">
										<li>
											<ul class="submenu dropdown-menu" role="menu">
											</ul>
											<a href="http://www.transparencia.pr.gov.br/pte/assunto/6/1?origem=3" class="ui-link ui-widget link-menu" target="_self">
											<i class="fa fa-arrow-right"></i>&nbsp; Permisos 1
											</a>
										</li>
										<li>
											<ul class="submenu dropdown-menu" role="menu">
											</ul>
											<a href="http://www.transparencia.pr.gov.br/pte/assunto/6/2?origem=3" class="ui-link ui-widget link-menu" target="_self">
											<i class="fa fa-arrow-right"></i>&nbsp; Permisos 2
											</a>
										</li>
										<li>
											<ul class="submenu dropdown-menu" role="menu">
											</ul>
											<a href="http://www.transparencia.pr.gov.br/pte/assunto/6/35?origem=3" class="ui-link ui-widget link-menu" target="_self">
											<i class="fa fa-arrow-right"></i>&nbsp; Permisos 3
											</a>
										</li>
										<li>
											<ul class="submenu dropdown-menu" role="menu">
											</ul>
											<a href="http://www.transparencia.pr.gov.br/pte/assunto/6/34?origem=3" class="ui-link ui-widget link-menu" target="_self">
											<i class="fa fa-arrow-right"></i>&nbsp; Permisos 4
											</a>
										</li>
									</ul>
								</li>
								<li class="item-icone">
									<a href="#" class="icone dropdown-toggle" data-toggle="dropdown">
									<img src="http://www.transparencia.pr.gov.br/pte/resources/images/icon-tema-informacoes-gerais.png" alt="INFORMAÃÃES GERAIS" class="icone-tema">
									<span>CONTENIDO DIDACTICO</span>
									</a>
									<div class="arrow-tema-icones"></div>
									<ul class="submenu dropdown-menu" role="menu">
										<li>
											<ul class="submenu dropdown-menu" role="menu">
											</ul>
											<a href="contenido_didactico/afinamiento_unidad_aprendizaje.jsp" class="ui-link ui-widget link-menu" target="_self">
											<i class="fa fa-arrow-right"></i>&nbsp; Afinar Unidades de Aprendizaje
											</a>
										</li>
										<li>
											<ul class="submenu dropdown-menu" role="menu">
											</ul>
											<a href="contenido_didactico/rmpp.jsp" class="ui-link ui-widget link-menu" target="_self">
											<i class="fa fa-arrow-right"></i>&nbsp; Registrar Material propuesto Preliminar
											</a>
										</li>
										<li>
											<ul class="submenu dropdown-menu" role="menu">
											</ul>
											<a href="http://www.transparencia.pr.gov.br/pte/assunto/8/41?origem=3" class="ui-link ui-widget link-menu" target="_self">
											<i class="fa fa-arrow-right"></i>&nbsp; Contenido 3
											</a>
										</li>
										<li>
											<ul class="submenu dropdown-menu" role="menu">
											</ul>
											<a href="http://www.transparencia.pr.gov.br/pte/assunto/8/48?origem=3" class="ui-link ui-widget link-menu" target="_self">
											<i class="fa fa-arrow-right"></i>&nbsp; Contenido 4
											</a>
										</li>
									</ul>
								</li>								
								<li class="item-icone">
									<a href="#" class="icone dropdown-toggle" data-toggle="dropdown">
									<img src="http://www.transparencia.pr.gov.br/pte/resources/images/icon-tema-compras.png" alt="COMPRAS" class="icone-tema">
									<span>NOTAS</span>
									</a>
									<div class="arrow-tema-icones"></div>
									<ul class="submenu dropdown-menu" role="menu">
										<li>
											<ul class="submenu dropdown-menu" role="menu">
											</ul>
											<a href="http://www.transparencia.pr.gov.br/pte/assunto/5/9?origem=3" class="ui-link ui-widget link-menu" target="_self">
											<i class="fa fa-arrow-right"></i>&nbsp; Nota 1
											</a>
										</li>
										<li>
											<ul class="submenu dropdown-menu" role="menu">
											</ul>
											<a href="http://www.transparencia.pr.gov.br/pte/assunto/5/10?origem=3" class="ui-link ui-widget link-menu" target="_self">
											<i class="fa fa-arrow-right"></i>&nbsp; Nota 2
											</a>
										</li>
										<li>
											<ul class="submenu dropdown-menu" role="menu">
											</ul>
											<a href="http://www.transparencia.pr.gov.br/pte/assunto/5/8?origem=3" class="ui-link ui-widget link-menu" target="_self">
											<i class="fa fa-arrow-right"></i>&nbsp; Nota 3
											</a>
										</li>
										<li>
											<ul class="submenu dropdown-menu" role="menu">
											</ul>
											<a href="http://www.transparencia.pr.gov.br/pte/assunto/5/11?origem=3" class="ui-link ui-widget link-menu" target="_self">
											<i class="fa fa-arrow-right"></i>&nbsp; Nota 4
											</a>
										</li>
									</ul>
								</li>
								<li class="item-icone">
									<a href="#" class="icone dropdown-toggle" data-toggle="dropdown">
									<img src="http://www.transparencia.pr.gov.br/pte/resources/images/icon-tema-convenios-transparencias.png" alt="RESPONSABILIDADE FISCAL" class="icone-tema">
									<span>UTIL</span>
									</a>
									<div class="arrow-tema-icones"></div>
									<ul class="submenu dropdown-menu" role="menu">
										<li>
											<ul class="submenu dropdown-menu" role="menu">
											</ul>
											<a href="http://www.transparencia.pr.gov.br/pte/assunto/7/36?origem=3" class="ui-link ui-widget link-menu" target="_self">
											<i class="fa fa-arrow-right"></i>&nbsp; Util 1
											</a>
										</li>
										<li>
											<ul class="submenu dropdown-menu" role="menu">
											</ul>
											<a href="http://www.transparencia.pr.gov.br/pte/assunto/7/53?origem=3" class="ui-link ui-widget link-menu" target="_self">
											<i class="fa fa-arrow-right"></i>&nbsp; Util 2
											</a>
										</li>
										<li>
											<ul class="submenu dropdown-menu" role="menu">
											</ul>
											<a href="http://www.transparencia.pr.gov.br/pte/assunto/7/54?origem=3" class="ui-link ui-widget link-menu" target="_self">
											<i class="fa fa-arrow-right"></i>&nbsp; Util 3
											</a>
										</li>
										<li>
											<ul class="submenu dropdown-menu" role="menu">
											</ul>
											<a href="http://www.transparencia.pr.gov.br/pte/assunto/7/37?origem=3" class="ui-link ui-widget link-menu" target="_self">
											<i class="fa fa-arrow-right"></i>&nbsp; Util 4
											</a>
										</li>
									</ul>
								</li>

							</ul>
						</div>
					</div>
				</div>
			</section>
		</form>
	

	<script type="text/javascript">
	
	</script>


</body></html>