import React, { Component } from 'react'
import Types from '../constants/Tags'


const content = 
    {
        id : 1,
        title : "MyFirstPost",
        date : "1/1/2017",
        tags : ["javascript", "website"],
        type : Types.PROJECT,
        head : "markdowncontent",
        body : "markdowncontent"
    }
    


class ContentView extends Component {

  render() {
    return (
        <div>
            <li>
                {content.id}
            </li>
            <li>
                {content.title}
            </li>
            <li>
                {content.date}
            </li>
        </div>
    );
  }
}

export default ContentView;