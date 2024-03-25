
    
        function reverseString() {
            var input = document.getElementById("inputString").value;
            var reversed = input.split('').reverse().join('');
            document.getElementById("reversedString").textContent = "Reversed string: " + reversed;
        }
