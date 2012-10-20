
interface Person {
	firstname: string;
	lastname: string;
}

function hello(person: Person)
{
	return 'Hello ' + person.firstname + ' ' + person.lastname;
}

var adam = {firstname: 'Adam', lastname: 'Doe' }

document.body.innerHTML = hello(adam);

