const mongoose=require('mongoose')

const empSchema=mongoose.Schema({
    name: String,
    email:String,
    phone: Number
})

module.exports=mongoose.model('Employee',empSchema)