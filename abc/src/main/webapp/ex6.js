var day = prompt("enter the day");
var result;
switch (day) {
	case "mon": result = "monday is bad";
		break;

	case "tus":
	case "wed":
	case "thr": result = "middays are okok";
		break;
	case "sat":
	case "sun": result = "weekly days are partydays";
		break;
	default:result="invalid input"
}
document.write(result);

