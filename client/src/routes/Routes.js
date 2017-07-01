
import Home from "./Home"
import ListView from "./ListView"
import React from 'react';
import ContentView from './ContentView'

const routes = [
    {
        path: "/",
        displayText : "Home",
        exact: true,
        component : Home
    },
    {
        exact : true,
        path : "/projects",
        displayText : "Projects",
        component : ListView
    },
    {
        path : "/blog",
        displayText : "Blog",
        component : () => <h1>Blog Page</h1>
    },
    {
        path : "/contact",
        displayText : "Contact",
        component : () => <h1>Contact Page</h1>
    },
    {
        exact : true,
        path : "/projects/:id",
        displayText : null,
        component : ContentView
    }

];

export default routes;