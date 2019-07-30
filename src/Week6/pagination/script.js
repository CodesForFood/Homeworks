var authorArr = [ {"Id" : 1, "Name" : "Author1"},{"Id" : 2, "Name" : "Author2"},{"Id" : 3, "Name" : "Author3"},{"Id" : 4, "Name" : "Author4"},{"Id" : 5, "Name" : "Author5"},{"Id" : 6, "Name" : "Author6"},{"Id" : 7, "Name" : "Author7"},{"Id" : 8, "Name" : "Author8"},{"Id" : 9, "Name" : "Author9"},{"Id" : 10, "Name" : "Author10"}
    ,{"Id" : 11, "Name" : "Author11"},{"Id" : 12, "Name" : "Author12"},{"Id" : 13, "Name" : "Author13"},{"Id" : 14, "Name" : "Author14"},{"Id" : 15, "Name" : "Author15"},{"Id" : 16, "Name" : "Author16"},{"Id" : 17, "Name" : "Author17"},{"Id" : 18, "Name" : "Author18"},{"Id" : 19, "Name" : "Author19"}
    ,{"Id" : 20, "Name" : "Author20"},{"Id" : 21, "Name" : "Author21"},{"Id" : 22, "Name" : "Author22"},{"Id" : 23, "Name" : "Author23"},{"Id" : 24, "Name" : "Author24"},{"Id" : 25, "Name" : "Author25"},{"Id" : 26, "Name" : "Author26"},{"Id" : 27, "Name" : "Author27"},{"Id" : 28, "Name" : "Author28"},{"Id" : 29, "Name" : "Author29"}
    ,{"Id" : 30, "Name" : "Author30"},{"Id" : 31, "Name" : "Author31"},{"Id" : 32, "Name" : "Author32"},{"Id" : 33, "Name" : "Author33"},{"Id" : 34, "Name" : "Author34"},{"Id" : 35, "Name" : "Author35"},{"Id" : 36, "Name" : "Author36"},{"Id" : 37, "Name" : "Author37"},{"Id" : 38, "Name" : "Author38"},{"Id" : 39, "Name" : "Author39"}
    ,{"Id" : 40, "Name" : "Author40"},{"Id" : 41, "Name" : "Author41"},{"Id" : 42, "Name" : "Author42"},{"Id" : 43, "Name" : "Author43"},{"Id" : 44, "Name" : "Author44"},{"Id" : 45, "Name" : "Author45"},{"Id" : 46, "Name" : "Author46"},{"Id" : 47, "Name" : "Author47"},{"Id" : 48, "Name" : "Author48"},{"Id" : 49, "Name" : "Author49"}
    ,{"Id" : 50, "Name" : "Author50"},{"Id" : 51, "Name" : "Author51"},{"Id" : 52, "Name" : "Author52"},{"Id" : 53, "Name" : "Author53"},{"Id" : 54, "Name" : "Author54"},{"Id" : 55, "Name" : "Author55"},{"Id" : 56, "Name" : "Author56"},{"Id" : 57, "Name" : "Author57"},{"Id" : 58, "Name" : "Author58"},{"Id" : 59, "Name" : "Author59"}];

//seed
function createAuthors(){
    for(var i = 1; i <= 60; i++ ){
        document.write('{"Id" : ' + i +', "Name" : "Author'+ i +'"},');
    }
}

//createAuthors();

console.log(authorArr.length);
var mainBody = document.getElementById("mainBody");
var numPerPage = 20;
var currentPage = 1;

function displayPage(){
    mainBody.innerHTML = "";
    var html = "<ul>";

    var maxOnPage = (numPerPage * currentPage);

    for(var i = (maxOnPage - 20); i < maxOnPage; i++) {
        if(i < authorArr.length){
            html += "<li>" + authorArr[i].Id + ": " + authorArr[i].Name +"</li>";
        }       
    }

    html += "</ul>";
    mainBody.innerHTML = html;
}

function nextPage(){
    var maxOnNextPage = (currentPage + 1)  * numPerPage;

    if(maxOnNextPage - 20 < authorArr.length){
        currentPage++;
        displayPage();
    }
}

function previousPage(){
    if(currentPage > 1 ){
        currentPage--;
        displayPage();
    }
}


displayPage();

