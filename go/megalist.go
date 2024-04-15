package main

import "fmt"

func main() {
    var list []int

    for i := 0; i <= 1_000_000_000; i++ {
        list = append(list, i)
    }

    fmt.Println(len(list))
}
