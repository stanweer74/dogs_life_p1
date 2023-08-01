import React from "react";
import DogDetail from "./DogDetail";
import Row from "react-bootstrap/Row"


const AllDogDetail =()=>{
    var count = dogs.length;

    return(
        <>
        <h1>Total Dogs: {count}</h1>
        <Row>
            {
                dogs.map(dog=>(
                    <DogDetail info={dog} key={dog.id.toString()}/>
                ))
            }

        </Row>
        </>
    )
}
export default AllDogDetail;


const dogs = [
    {"id":1,"name":"Fido", "age":3, "owner_id":1},
    {"id":2, "name":"Rex", "age":2, "owner_id":2},
    {"id":3, "name":"Spot", "age":1, "owner_id":3},
]
