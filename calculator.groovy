double Doob1 
double Doob2 

double result
//int i

for (i=0; i<2; i++){
	int j = i + 1
	print " enter number " + j + ": "
	String str1 = System.console().readLine()

	if (i == 0){
		Doob1 = Double.parseDouble(str1)
	}else{
		Doob2 =  Double.parseDouble(str1)
	}
}
println "Do you want to :"
println "Add  (type: 1)"
println "Substract (type: 2)"
println "Multiply (type: 3)"
println "Divide (type: 4)"
println "please enter the operator code: "
String str2 = System.console().readLine()
int code = Integer.parseInt(str2)

switch (code) {
case 1:
	result = Doob1 + Doob2
	break;
case 2:
	result = Doob1 - Doob2
	break;
case 3:
	result = Doob1 * Doob2
	break;
case 4:
	result = Doob1 / Doob2
	break;
default:
	println  "Wrong Input"
}

println "the result is: " + result
