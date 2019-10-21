import React, { Component } from 'react';

class Bye extends Component {
    render() {
         const {name,designation}= this.props
           return  <h1>Thanks for visiting my website
                {name} and {designation}

            </h1>
        
    }
}

export default Bye;