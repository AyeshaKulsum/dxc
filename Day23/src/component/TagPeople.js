import React,{Component} from 'react'
class TagPeople extends  Component{
constructor()
{
    super();
    console.log("Cons called")
    this.state={
        message:"Please subscribe",
        quotes:"hello"
    }
}
subscribeMe()
{
    this.setState(
        {
            message:"Congrats you have subscribed successfully",
        quotes: "How r u today"
        }
    )
}
render(props)
{
    console.log("Render called")
    return <div>
        <h1>Tag {this.props.friendname} and annoy her</h1>
        <h1>
            Message is : {this.state.message}<br/>
            Quotes is : {this.state.quotes}
            <br/>
            <button onClick={() => this.subscribeMe()}>Subscribe</button>
        </h1>
        </div>
}
}
export default TagPeople;