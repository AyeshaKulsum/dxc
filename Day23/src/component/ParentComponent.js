import React, { Component } from 'react';
import ChildComponent from './ChildComponent';

class ParentComponent extends Component {
   constructor(props) {
       super(props);
       this.state={
           data:"Apple"
       }
       this.parentMessage=this.parentMessage.bind(this)
   };
   parentMessage()
   {
       this.setState({
           data:"Child Apple"
       })
   } 

render() {
    return (
        <div>
            <ChildComponent myDataProp={this.state.data}
            updateStateProp={this.parentMessage}
            ></ChildComponent>
        </div>
    );
}
}
export default ParentComponent;