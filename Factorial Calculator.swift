import Foundation

func factorial(of number: Int) -> Int {
    if number == 0 {
        return 1
    }
    return number * factorial(of: number - 1)
}


print("Enter a number:")


if let input = readLine(), let number = Int(input) {
    if number >= 0 {
        let result = factorial(of: number)
        print("The factorial of \(number) is \(result).")
    } else {
        print("Please enter a non-negative number.")
    }
} else {
    print("Invalid input. Please enter an integer.")
}
