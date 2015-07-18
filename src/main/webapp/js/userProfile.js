var library = library || {};

	//binds
$(function(){	 
	$("#addInterestBtn").on("click",function(){
		$("#addInterestForm").show();
		$("#interestMainContent").hide();
	});
	$("#CancelBtn").on("click",function(){
		$("#addInterestForm").hide();
		$("#interestMainContent").show();
	});
	$( "#interestForm" ).on( "submit", function( event ) {
		 console.log( $("#name").val() );
		 console.log( $(this).serialize() );
		 event.preventDefault();
	});
	$("#addEventBtn").on("click",function(){
		window.location.href = "addEvent";
	});

	
	var action = "${action}";
	if(action ==='added'){
		alert("Event Added");
	}
	
});

	//request
