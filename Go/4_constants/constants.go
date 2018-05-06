package main

import(
	"fmt"
	"math"
)

const s string = "0x008800"

func main(){
	fmt.Println(s)

	const n = 5000000000000

	const d = 3e20 / n
	fmt.Println(int64(d))

	fmt.Println(math.Sin(n))
}
