interface JQuery { 
    text(content: string); 
}

interface JQueryStatic {
    get(url: string, callback: (data: string) => any); 
    (query: string): JQuery;
} 

declare var $: JQueryStatic;

$.get("http://mysite.org/divContent",
    function (data: string) { 
        $("div").text(data);
    });

	