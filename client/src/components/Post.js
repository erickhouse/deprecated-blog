
import React, { Component } from 'react';
import {Label} from 'react-bootstrap';

const Tag = ({content}) => {
    return <Label className="Tag mr-1">{content}</Label>
};

const PostHeading = ({data}) => (
        <div className=" Post">
            <div className="border-bottom">
                <div className="p-1 bg-dark-gray">
                    <a className="link-gray-dark"> <h1> This is a heading </h1> </a>
                    <div className="text-gray-light Right">Posted on -  6/1/2017 </div>
                    <div className="flex-table">                 
                        <div className="flex-table-item">
                            <i className="fa fa-tags mr-1" aria-hidden="true"/>
                            <Label className="Tag mr-1">Javascript</Label>
                            <Label className="Tag mr-1">Scala</Label>
                        </div>
                    </div>
                </div>              
            </div>
            <div className="">
                <div className="p-2 pl-4">
                    Some body text
                </div>   
            </div>          
        </div>
);

export default PostHeading;

            {/*<Media style={{margin:20}}>
                <Media.Left align="middle">
                    {data.heading.media}
                </Media.Left>
                <Media.Body>
                    <Media.Heading style={{textAlign:"left"}}>{data.title}</Media.Heading>
                    <div style={{textAlign:"left"}}>
                        <i className="fa fa-tags" aria-hidden="true"/>
                        {data.tags.map((tag, i) => {
                            return(
                                <Tag content={tag} key={i}/>
                            );
                        })}
                    </div>
                    <div>
                        {data.body.content}
                    </div>
                    <button className="btn btn-primary" type="button">Primary button</button>
                </Media.Body>
            </Media>
            <Divider/>*/}