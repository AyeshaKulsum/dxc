import React, { Component } from 'react';
import PropTypes from 'prop-types';

class Lifecycle extends Component {
    constructor(props) {
        super(props);
        this.state=(
            {
                commentsText:this.props.commentsText
            }
        )
        console.log("1.cons called")
    }

    componentWillMount() {
console.log("2.commentWillMount executed")
this.setState({
    commentsText:'Lets start the session'
})
    }

    componentDidMount() {
        console.log("4.componentDidMount executed")
        this.setState({
            commentsText:'Lets start for Lunch'
        })
    }

    

    render() {
console.log("3.render called")

        return (
            <div>
<h1>Welcome {this.state.commentsText}</h1>
            </div>
        );
    }
}

Lifecycle.propTypes = {

};

export default Lifecycle;