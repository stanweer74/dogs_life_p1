import React from 'react'

const DogDetail = (props) => {
  return (
    <div>
        <p className='green-class'> Name: {props.info.name}</p>
        <p className='green-class'> Age: {props.info.age}</p>
        <p className='green-class'> Owner ID: {props.info.owner_id}</p>

    </div>
  )
}

export default DogDetail