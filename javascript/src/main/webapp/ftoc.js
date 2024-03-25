function convertToFahrenheit()
{
	const FahrenheitInput = document.getElementById("FahrenheitInput").value;
	const CelsiusTempareture = (parseFloat(FahrenheitInput)-32)*5/9;
	
	document.getElementById('CelsiusOutput').value=CelsiusTempareture.toFixed(2);
	
}