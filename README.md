
# Personal Blog Site

## Status

This project is no longer being maintained but was an extremely useful learning tool. It has been replaced a Pure React App which is hosted on GitHub pages. 

>What I learned: 

>- Build tools and compliers / transpilers (server and client)
>- Library dependency management
>- A plethora of different library API's (Bootstrap, React, Play, Node.js, JSP, and many more)
>- Design patterns in the UI, Client, and Server
>- Database management and configuration
>- Database schema creation
>- ORM's and database drivers
>- The nightmare that is CSS>

## Purpose

A personal website to aid in interviewing and the hiring process. The goal was to display personal projects and post about what I was learning. 

## Motivation

The purpose of this project was to build a personal website from scratch using the latest and greatest technologies. 
My journey began around November 2016. At that time, I was working on embedded devices and nearly everything I worked on was in C++. I had only recently graduated (December 2015) and had no experience with web development. I was unfamiliar with the jargon or any of the best practices. I needed to fix that.

## The Journey (Retrospective)

I'm a person who likes to build things from the ground up so that I can conceptualize most the inner workings of a framework. Software abstraction can be incredibly unhelpful when you have no idea what the component is doing. Especially when you are first learning something new.

> **Retrospective** Building websites from scratch can be incredibly easy when you know what you are doing but can be extremely time consuming when you don’t.  

#### JSP (~ November 2016)
I decided to try and build a site using JSP and servlets. I wanted to understand the common paradigms of a decade ago and how they contrasted with today. I went through several tutorials and learned about terms like `template engines`, `routes` and `servlets`. Once I learned the basics I determined that learning JSP was no longer helpful and moved on to the next thing. 

#### Node.js (~ December 2016)
I kept hearing about this great new technology called Node.js. What was it? Why was it so popular? I walked through several tutorials learning the basics.
- I learned that Node.js is simply a JavaScript interpreter written in C++. Node.js wraps the Google Chrome V8 JavaScript Engine in   order to do things like access the file system. You can even extend the JavaScript language by writing your own node C++ extensions.   Cool!
- I learned about how node uses modules to make JavaScript easier to write and that the node engine implicitly wraps all your JS files in function scope. 
- I learned how node implements its event system using first class functions
- I learned about NPM and how amazingly easy it is to install external packages
- I began to realize how helpful is it to use the same language on the front end and back end
- I learned about express and its powerful routing system. 

These things are pretty amazing when you come from a pure C++ background. Sadly, I wasn't much closer to completing my website, but my understanding was starting to come together. 

#### React.js ( ~ February 2017 )

> **Retrospective** Single Page Applications are overkill for someone who hasn't built a website before

Now that I had some understanding of how the server side of my website was going to work, I jumped over to the front end to implement the first iteration of my wire frame design. I did a ton of research on building a front end for a website. At this point I really understanding where the term **JavaScript Fatigue** comes from. Turns out that there are a million different ways you can build a front end. For a beginner, this can be a very confusing and frustrating experience. Ultimately, I landed on using React.js.

I had just barely finished learning how to build basic sites before I jumped over to single page applications. I had to learn quite a few more concepts before I could even display my first html page. There is a lot to know. At this point I had changed jobs and was using React.js at work. React was still new to me but I was getting used to the single direction flow of data using `this.state and this.props`

Just to get the hello world running I needed to learn a bunch of build tools and configure my own JavaScript Transpiler! 

 - ES6, Babel, Webpack, NPM
 
Thankfully Facebook already provides a pre-configured solution called `create-react-app` but I didn't find that out until after many painful hours of work assembling a proper webpack configuration myself. 

> **Retrospective** Configuring single page applications really gets in the way of building the app. Overall, I spent significantly more time fighting with tools and libraries than I did building my web app. 

Okay, great. I can compile. I can start building my web pages now, right? Nope! After hours and hours spent researching frameworks and build tools I now needed the proper libraries that would support the design pattern. 

 - Redux, React-Router, ajax requests, promises, client side vs server side routing, cross-origin resource sharing (CORS)
 
 Now I was ready to start building my react components. 
 
 #### HTML and CSS ( ~ April 2017 )
 
 > **Retrospective** My absolute least favorite part of the whole project was getting the styling to look right. 
 
I had some previous experience with CSS. I figured that Twitter's Bootstrap would be a good starting point. I found an NPM library that implemented bootstrap as react components. I created my basic Navbar and things were going well. 
 
I started getting around to putting images into the Navbar. Okay, that was easy but why is the alignment off? How come when I change the image size slightly all the images drop into a vertical column? It became impossibly hard to figure out which style was forcing my components to do what. It was made worse by the fact that the react library abstracted all the actual CSS classes. Half the time when I would try to override a style it simply wouldn't do anything. I was going crazy. 

 > **Retrospective** Working with an external CSS library feels like working with a OOP hierarchy that is 17 levels deep. It seems easier to write it from scratch than deal with the complexity
 
I gave up on the react bootstrap library and tried several other raw CSS libraries. I was having issues integrating them because they were written in SCSS. Now I needed to change my Webpack configuration just to try out different options! I needed a break. 

#### Back to the Server ( ~ May 2017 )

I had just completed an online course in Scala and Functional Programming. I was really excited about the language so I decided to switch backend technologies. I settled on using the Play framework. 

 > **Retrospective** Don't switch backend technologies in the middle of a project. It’s too much work. 
 
 I had to re-learn how to do some certain things. Trying to get Play and React to work together took a while. I painfully learned about the **convention over configuration** concept. I ended up creating a build script that placed react output files in the public location so Play would serve them correctly. The way Play is set up, felt like it forced me to use their template engine. I didn't want to. It was the wrong tool for the job. 
 
 Over the course of setting up the server I got to learn :
 
 - Slick ( A Scala ORM ), Postgres Setup, Scala to Json libraries, Scala Futures ( really cool once you know how they work ) 
 
  > **Retrospective** 50 % of the server side effort consisted of trying to figure out why the database wouldn't connect. The software version had changed the database config to use `username` instead of the previous `user`. I only got the error "couldn’t connect". Go figure. **Be careful about software versioning!**

#### Fatigue ( ~ June 2017 )

I was at the end of the rope. By the end of it all I had a working client (React) and server (Play). The client would display a list of fake blog posts that I had in my database. I wasn't really learning anything anymore and the tools I had originally picked weren't working out. I wasn't having fun. 

#### Conclusion

I learned an immense number of different things about all sorts of different topics. There is a big difference between working on an existing web app and setting up the web app from the beginning to end. 




 
 




