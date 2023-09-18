document.addEventListener("DOMContentLoaded", function () {
    const form = document.getElementById("calculator-form");
    const firstNoInput = document.getElementById("firstNo");
    const secondNoInput = document.getElementById("secondNo");
    const resultSpan = document.getElementById("result");

    form.addEventListener("submit", function (e) {
        e.preventDefault();
    });
    
    function calculate(operation) {
        const firstNo = parseInt(firstNoInput.value);
        const secondNo = parseInt(secondNoInput.value);
        let result;

        switch (operation) {
            case "add":
                result = firstNo + secondNo;
                break;
            case "subtract":
                result = firstNo - secondNo;
                break;
            case "multiply":
                result = firstNo * secondNo;
                break;
            case "divide":
                if (secondNo === 0) {
                    resultSpan.textContent = "Cannot divide by zero";
                    return;
                }
                result = firstNo / secondNo;
                break;
            default:
                result = "Invalid operation";
        }

        resultSpan.textContent = result;
    }

    document.getElementById("Add").addEventListener("click", () => calculate("add"));
    document.getElementById("Sub").addEventListener("click", () => calculate("subtract"));
    document.getElementById("Mul").addEventListener("click", () => calculate("multiply"));
    document.getElementById("Div").addEventListener("click", () => calculate("divide"));
});
