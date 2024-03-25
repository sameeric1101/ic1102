function validationForm()
{
	//Read the form data
	var proId = document.getElementById("proId").value;
	var proName = document.getElementById("proName").value;
	var proPrice = document.getElementById("proPrice").value;
	var proBrand = document.getElementById("proBrand").value;
	var promadeIn = document.getElementById("proMadeIn").value;
	
	if(proId.trim()===""||proName.trim()===""||
	proPrice.trim()===""||proBrand.trim()===""||
	promadeIn.trim()==="")
	{
		alert("All fields must be filled out");
		return false;
	}
	    if(parseFloat(proPrice)<0){
			 alert("proPrice must be a non-negitive value");
			 return false;
		 }
		 if(proName.length >50 || proBrand.length >50){
			 alert("prodcut Name  and proBrand must be less then 50 charecters");
			 return false;
		}
		//get the mfg & exp data
		var proMfgDate = document.getElementById("proMfgDate").value;
		var proexpdate = document.getElementById("proExpDate").value;
	
		//convert into data format
		var ManufacturingDateObj = new Data(proMfgDate);
		//var ExpiryDateObj = new Data(proMfgDate);
		
		//check the validation of dates
		if(ManufacturingDateObj > ExpiryDateObj)
		{
			alert("Manufacturing Date connot be greater than ExpiryDate..");
			return false;
		}		







}