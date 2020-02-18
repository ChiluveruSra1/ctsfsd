import { Pipe, PipeTransform } from '@angular/core'


@Pipe({
    name:'title'
})
export class TitlePipe implements PipeTransform{

    transform(value: string, gender: string): string{
        if(gender=="Male" || gender=="male")
            return "Mr. "+value
        else
            return "Mrs. "+value
    }
}