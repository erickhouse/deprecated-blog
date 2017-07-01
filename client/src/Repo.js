



function Repo(){

    var posts = [];

    return function PostRepo(client) {
        fetch('/posts').then((response) => 
        {
            return response.json();
        }
        ).then((data) => 
        {
            posts = posts.concat(data);
            client(posts);
        });
    }

}



export default Repo();