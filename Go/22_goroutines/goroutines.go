package main
import "fmt"

func f(from string){
	for i := 0; i < 1000; i++{
		fmt.Println(from, ":", i)
	}
}

func main(){
	f("direct")

	go f("goroutine")

	go func(msg string){
		for i := 0; i < 1000 ;i++{
			fmt.Println(msg)
		}
	}("going")

	fmt.Scanln()
	fmt.Println("done")
}
