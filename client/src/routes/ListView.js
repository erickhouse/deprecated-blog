/*@flow*/
import React, { Component } from 'react';
import { Grid, Row, Col, Panel} from 'react-bootstrap';
import { Link } from 'react-router-dom';

import { UserCard, RepoCard } from 'react-github-cards';
import 'react-github-cards/dist/default.css';

import { BrowserRouter as Router, Route} from 'react-router-dom'
 
// use medium theme
 //import { UserCard, RepoCard } from 'react-github-cards/dist/medium'
//import 'react-github-cards/dist/medium.css';
import ReactMarkdown from 'react-markdown';


class ListView extends Component {

  render() {
    return (
        <Grid>
            <Row className="show-grid">
                <Col>
                    <Panel header="Projects List">
                        <div>
                        <UserCard username="erickhouse1" />
                        <RepoCard username="erickhouse1" repo="InterviewPractice"/>
                        </div>
                    </Panel>
                </Col>
            </Row>
            <Row><ReactMarkdown source="# hello, I'm markdown"/></Row>

            
        </Grid>   
    );
  }
}



export default ListView;