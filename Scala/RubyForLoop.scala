
def forLoop
{
	println("for loop using Ruby-style iteration")

	args.foreach {
		arg =>
			println(arg)
	}
}

forLoop