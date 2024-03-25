function convertToINR()
{
	const USDInput = document.getElementById("USDInput").value;
	const INRVALUE = (parseFloat(USDInput)*82.25);
	
	document.getElementById('INROutput').value=INRVALUE.toFixed(3);
	
}