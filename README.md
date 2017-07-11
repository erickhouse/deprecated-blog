
# Personal Blog Site

### Status

This project is no longer being maintained but was an extremely useful learning tool. It has been replaced with something else. 

## Purpose

A perosnal website to aid in interviewing and the hiring process. The goal was to display personal projects and post about what I was learning. 

## Movtivation

The purpose of this project was to build a personal website from scratch using the latest and greatest technologies. My jounrney began
around November 2016. At that time I was working on embedded devices and nearly everything I worked on was in C++. I had only recently graduated (December 2015) and had no experince with web development. I was unfamiliar with the jargon or any of the best practices. I needed to fix that.

## The Journey (Retrospective)

I'm a person who likes to build things from the ground up so that I understand the whole pipeline and can conceptualize most of the inner workings of a framework. Software abstraction can be incredibly unhelpful when you have no idea what the component is doing. Especially when you are first learning something.

> **Retrospective** Buidling websites from scratch can be incredibly easy when you know what you are doing but feel extremely complex if you don't.  

#### JSP (~ November 2016)
I decided to try and build a site using JSP and servlets. I wanted to understand the common paradigms of a decade ago and how they contrasted with today. I went through several tutorials and learned about terms like `template engines`, `routes` and `servlets`. Once I learned the basics I determined that learning JSP was no longer helpful and moved on to the next thing. 

#### Node.js (~ December 2016)
I kept hearing about this great new technology called Node.js. What was it? Why was it so popular? I walked through several tutorials learning the basics.

- I learned that Node.js is simply a Javascript interpreter written in C++. Node.js wraps the Google Chrome V8 JavaScript Engine in order to do things like access the file system. You can even extend the JavaScript language by writing your own node C++ extentions. Cool!
-I learned about how node uses modules to make JavaScript easier to write and that the node engine implictly wraps all of your js files in function scope. 
-I learned how node implements its event system using first class functions
-I learned about NPM and how amazingly easy it is to install external packages
-I began to realize how helpful is it to use the same language on the front end and back end
-I learned about express and its powerful routing system. 

All of these thing are pretty amazing when you only know C++. Sadly, I wasn't much closer to completing my website, but my understanding was starting to come together. 

#### React.js ( ~ Feburary 2017 )

> **Retrospective** Single Page Applications are overkill for someone who hasn't build a website before

Now that I had some understanding of how the server side of my website was going to work, I jumped over to the front end to implement the first iteration of my wire frame design. I did a ton of research on building a front end for a website. At this point I really understanding where the term **Javascript Fatigue** comes from. Turns out that there are a million different ways you can build a front end. For a begininer, this can be a very confusing and frustratig experience. Ultimeatly I landed on using React.js.

I had just barely finished learning how to build basic sites before I jumpped over to single page applications. I had to learn quite a few more concepts before I could even display my first html page. There is a lot to know. At this point I had changed jobs and was using React.js at work. React was still new to me but I was getting used to the single direction flow of data using `this.state({}) and this.props`

Just to get the hello world running I needed to learn a bunch of build tools and configure my own JavaScript Transpiler! 

 - ES6, Babel, Webpack, NPM
 
Thankfully facebook already provides a pre-configured solution called `create-react-app` but I didn't find that out until after many painful hours of work assembiling a proper webpack configuration. 

Okay, great. I can build. I can start building my web pages now, right? Nope! After hour and hours spent researching frameworks and build tools I now needed the proper libraries that would support the design pattern. 

 - Redux, React-Router, ajax requests, promises, client side vs server side routing, cross-origin resource sharing (CORS)
 
 
 




