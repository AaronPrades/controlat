var inicio = {
		
		init : function() {
			this.handleFunctionesInicio();
		},	
		
		handleFunctionesInicio : function() {
			$('#redirectAula').on('click', function() {
				window.location.href = '/aula';
			});
		}
}

$(function() {
	inicio.init();
});